package packCar;

/*
Zadanie 1
I) Zaprojektuj encję Car modelującą samochód. Samochód powinien posiadać:
- unikalny identyfikator (int id)
- markę (String brand)
- model (String model)
- typ nadwozia (CarBodyType carBodyType) będący enumem (np. SEDAN, COMBI, CABRIO);
przechowywanym w baize jako String
- data produkcji (LocalDate productionDate)
- kolor (String color)
- ilość przejechanych kilometrów (long km)
- datę modyfikacji (LocalDateTime modifiedDate) (@UpdateTimestamp)
- int age; – pole to ma być automatycznie ustawiane
#
# Formula przyjmuje w cudzysłowiu kod SQL (różny w zależności od tego jakiej bazy używamy - np. dla mongo musi to być zapytanie mongo)
II) Zaimplementuj klasę CarDAO umożliwiającą:
- tworzenie auta
- odczytywanie auta po id
- zmianę parametrów auta
- usuwanie auta
- odczytywanie wszystkich aut (zaproponuj kilka sortowań)
- odczytywanie aut wg. marki, typu nadwozia, daty produkcji
- wyszukanie najstarszego/najmłodszego samochodu
- wyszukanie samochodu o największym/najmniejszym przebiegu
 */

public class Main {
    public static void main(String[] args) {

    }
}
