package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer implementuje specjalny rodzaj rymiarza oparty na logice wież Hanoi
 * Odrzuca elementy, które są większe od aktualnego szczytu stosu, aby zachować porządek malejący
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /** Licznik elementów, które nie zostały dodane z powodu złamania zasady Hanoi*/
    private int totalRejected = 0;

    /**
     * Zwraca liczbę odrzuconych elementów
     * @return całkowita liczba odrzuconych rymów
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Próbuje dodać nową wartość do rymiarza
     * Jeśli rymiarz nie jest pusty i nowa wartość jest większa niż aktualny szczyt
     * wartość zostaje odrzucona, a licznik odrzuceń zwiększony
     * @param in wartość, którą próbujemy dodać
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     * Metoda dostępowa do pola totalRejected
     * @return aktualna wartość licznika odrzuceń
     */
    public int getTotalRejected() {
        return totalRejected;
    }
}