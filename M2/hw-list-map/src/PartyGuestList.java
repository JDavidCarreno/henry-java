import java.util.HashSet;
import java.util.Set;

public class PartyGuestList {
        private Set<String> guests;

        public PartyGuestList(){
            guests = new HashSet<>();
        }

        public void addGuest(String guest){
            guests.add(guest);
            System.out.println("Se agrego!");
        }

        public void removeGuest(String guest){
            guests.remove(guest);
            System.out.println("Se eliminó");
        }

        public void isGuestInList(String guest) {
            System.out.println("¿Esta en la lista?: " + guests.contains(guest));
        }

        public void getTotalGuests(){
            System.out.println("El total de invitados en el set es: " + guests.size());
        }

        public Set<String> getGuests() {
            return guests;
        }

}
