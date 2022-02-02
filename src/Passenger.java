public class Passenger {
    private static int idCounter;
    private int id;

    private static class Address {
        String street, city, state;

        public Address(
                String street,
                String city,
                String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private Address address;

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    private Contact contact;

    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }

}
