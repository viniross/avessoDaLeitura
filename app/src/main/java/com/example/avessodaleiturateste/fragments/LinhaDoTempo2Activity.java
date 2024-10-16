package com.example.avessodaleiturateste.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.avessodaleiturateste.R;

import java.util.Arrays;
import java.util.List;


public class LinhaDoTempo2Activity extends Fragment {

    private boolean isZoomed = false; // Variável de controle comum
    private View[] allCircles; // Array para armazenar todos os círculos
    private ViewGroup rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Infla o layout do fragmento
        rootView = (ViewGroup) inflater.inflate(R.layout.activity_linha_do_tempo2, container, false);

        // Referencia os círculos e as informações
        View circleView1 = rootView.findViewById(R.id.nasciPedro);
        TextView txtTitulo11 = rootView.findViewById(R.id.txtTituloNasciPedro);
        TextView txtInfo12 = rootView.findViewById(R.id.txtInfoPedro);

        View circleView2 = rootView.findViewById(R.id.acadEMilitPedro);
        TextView txtTitulo21 = rootView.findViewById(R.id.txtTituloAcadEMilitPedro);
        TextView txtInfo22 = rootView.findViewById(R.id.txtInfoAcadEMilit);

        View circleView3 = rootView.findViewById(R.id.encPedroEMarta);
        TextView txtTitulo31 = rootView.findViewById(R.id.txtTituloEncPedroEMarta);
        TextView txtInfo32 = rootView.findViewById(R.id.txtInfoEncPedro);

        View circleView4 = rootView.findViewById(R.id.nasciHenri);
        TextView txtTitulo41 = rootView.findViewById(R.id.txtTituloNasciHenri);
        TextView txtInfo42 = rootView.findViewById(R.id.txtInfoHenri);

        // Coloca todos os círculos em um array para fácil acesso
        allCircles = new View[]{circleView1, circleView2, circleView3, circleView4};

        // Aplica o listener de zoom para cada círculo
        applyMoveAndZoomEffect(circleView1, txtTitulo11, txtInfo12,txtTitulo11,txtInfo12,txtTitulo21,txtInfo22,txtTitulo31,txtInfo32,txtTitulo41,txtInfo42);
        applyMoveAndZoomEffect(circleView2, txtTitulo21, txtInfo22,txtTitulo11,txtInfo12,txtTitulo21,txtInfo22,txtTitulo31,txtInfo32,txtTitulo41,txtInfo42);
        applyMoveAndZoomEffect(circleView3, txtTitulo31, txtInfo32,txtTitulo11,txtInfo12,txtTitulo21,txtInfo22,txtTitulo31,txtInfo32,txtTitulo41,txtInfo42);
        applyMoveAndZoomEffect(circleView4, txtTitulo41, txtInfo42,txtTitulo11,txtInfo12,txtTitulo21,txtInfo22,txtTitulo31,txtInfo32,txtTitulo41,txtInfo42);

        isZoomed = false;

        return rootView; // Retorna a view inflada
    }

    // Método para aplicar o zoom em qualquer círculo
    private void applyMoveAndZoomEffect(final View circleView, final TextView txtTitulo, final TextView txtInfo,final TextView txtTitulo1, final TextView txtInfo1,final TextView txtTitulo2, final TextView txtInfo2,final TextView txtTitulo3, final TextView txtInfo3,final TextView txtTitulo4, final TextView txtInfo4) {
        circleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (!isZoomed) {
                    moveCircleToCenter(circleView, new Runnable() {
                        @Override
                        public void run() {
                            animateZoom(circleView, 1f, 3f);
                            hideAllViewsExcept(circleView); // Esconde todos os outros círculos e textos
                            showTextWithFade(txtInfo); // Mostra os textos associados ao círculo clicado
                            showTextWithFade(txtTitulo);
                            isZoomed = true;
                        }
                    });
                } else {
                    // Reduz o círculo ao tamanho original
                    animateZoom(circleView, 3f, 1f);
                    moveCircleBack(circleView);
                    hideTextWithFade(txtInfo); // Oculta os textos associados ao círculo clicado
                    hideTextWithFade(txtTitulo);
                    showAllViewsExcept(txtTitulo, txtInfo); // Mostra todos os outros círculos e textos
                    isZoomed = false;
                    hideAllTextWithFade(txtTitulo1,txtInfo1,txtTitulo2,txtInfo2,txtTitulo3,txtInfo3,txtTitulo4,txtInfo4);

                }
            }
        });
    }

    private void moveCircleToCenter(View circleView, final Runnable onComplete) {
        ViewGroup parent = (ViewGroup) circleView.getParent();
        int parentWidth = parent.getWidth();
        int parentHeight = parent.getHeight();

        int[] location = new int[2];
        circleView.getLocationOnScreen(location);
        float currentX = location[0];
        float currentY = location[1];

        float translationX = (parentWidth / 2f) - (circleView.getWidth() / 2f) - currentX;
        float translationY = (parentHeight / 2f) - (circleView.getHeight() / 2f) - currentY;

        circleView.animate()
                .translationXBy(translationX)
                .translationYBy(translationY)
                .setDuration(500)
                .withEndAction(onComplete) // Executa o zoom após o movimento
                .start();
    }

    private void moveCircleBack(View circleView) {
        circleView.animate()
                .translationX(0)
                .translationY(0)
                .setDuration(500)
                .start();
    }

    private void animateZoom(View view, float startScale, float endScale) {
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, "scaleX", startScale, endScale);
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(view, "scaleY", startScale, endScale);
        scaleX.setDuration(500);
        scaleY.setDuration(500);
        scaleX.start();
        scaleY.start();
    }

    private void showTextWithFade(final TextView textView) {
        textView.setVisibility(View.VISIBLE);
        textView.setAlpha(0f);
        textView.animate()
                .alpha(1f) // Transição suave de opacidade
                .setDuration(500)
                .start();
    }

    private void hideTextWithFade(final TextView textView) {
        textView.animate()
                .alpha(0f)
                .setDuration(500)
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        textView.setVisibility(View.GONE); // Torna o texto invisível após o fade out
                    }
                })
                .start();
    }


    private void hideAllTextWithFade(final TextView textView1,final TextView textView2,final TextView textView3,final TextView textView4,final TextView textView5,final TextView textView6,final TextView textView7,final TextView textView8) {

        hideTextWithFade(textView1);
        hideTextWithFade(textView2);
        hideTextWithFade(textView3);
        hideTextWithFade(textView4);
        hideTextWithFade(textView5);
        hideTextWithFade(textView6);
        hideTextWithFade(textView7);
        hideTextWithFade(textView8);
    }



    // Método para esconder todos os círculos e textos, exceto o que foi clicado
    private void hideAllViewsExcept(View circleView) {
        for (int i = 0; i < rootView.getChildCount(); i++) {
            View child = rootView.getChildAt(i);

            // Se for um círculo ou TextView, esconde-o, exceto o que foi clicado
            if (child != circleView && !(child instanceof TextView)) {
                child.animate()
                        .alpha(0f)
                        .setDuration(500)
                        .start();
                child.setVisibility(View.GONE);
            } else if (child instanceof TextView) {
                // Também esconde todos os TextViews para garantir que todos os textos sumam
                child.animate()
                        .alpha(0f)
                        .setDuration(500)
                        .start();
                child.setVisibility(View.GONE);
            }
        }
    }



    // Método para mostrar todos os círculos e textos, exceto os ocultos (os textos que pertencem ao círculo clicado)
    private void showAllViewsExcept(View... hiddenViews) {
        List<View> viewsToHide = Arrays.asList(hiddenViews);

        for (int i = 0; i < rootView.getChildCount(); i++) {
            View child = rootView.getChildAt(i);

            if (viewsToHide.contains(child)) {
                // Se a view está na lista de views a serem ocultadas, faz fade-out
                child.animate()
                        .alpha(0f)
                        .setDuration(500)
                        .start();
                child.setVisibility(View.GONE);
            } else {
                // Garante que as outras views estejam visíveis
                child.setVisibility(View.VISIBLE);
                child.animate()
                        .alpha(1f)
                        .setDuration(500)
                        .start();
            }
        }
    }
}