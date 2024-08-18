package StreamAPI.stream_Basic_Questions;

import java.util.*;

class ContactData {
    String name;
    String birthDate;
    List<String> phones;
    int lastUpdateTime;

    public ContactData(String name, String birthDate, List<String> phones, int lastUpdateTime) {
        this.name = name;
        this.birthDate = birthDate;
        this.phones = phones;
        this.lastUpdateTime = lastUpdateTime;
    }
}

public class UserMainCode {
    public String mergeContacts(String input1) {
        ArrayList<ContactData> contactsInput = readInput(input1);
        ArrayList<ContactData> mergedContacts = new ArrayList<>();

        // Create a map to store unique contacts based on phone numbers
        Map<String, ContactData> phoneToContact = new HashMap<>();

        for (ContactData contact : contactsInput) {
            boolean merged = false;
            for (String phone : contact.phones) {
                if (!phone.equals("empty") && phoneToContact.containsKey(phone)) {
                    // Merge with existing contact
                    ContactData existingContact = phoneToContact.get(phone);
                    mergeContactData(existingContact, contact);
                    merged = true;
                    break;
                }
            }

            if (!merged) {
                // Add as a new contact
                for (String phone : contact.phones) {
                    if (!phone.equals("empty")) {
                        phoneToContact.put(phone, contact);
                    }
                }
                mergedContacts.add(contact);
            }
        }

        // Sort contacts by name
        Collections.sort(mergedContacts, Comparator.comparing(c -> c.name));

        // Create output string
        return createStringOutput(mergedContacts).trim();
    }

    private void mergeContactData(ContactData existing, ContactData newContact) {
        // Keep the more recent contact's name and update time
        if (newContact.lastUpdateTime > existing.lastUpdateTime) {
            existing.name = newContact.name;
            existing.lastUpdateTime = newContact.lastUpdateTime;
        }

        // Merge birth date if empty
        if (existing.birthDate.equals("empty") && !newContact.birthDate.equals("empty")) {
            existing.birthDate = newContact.birthDate;
        }

        // Merge phone numbers
        Set<String> uniquePhones = new HashSet<>(existing.phones);
        uniquePhones.addAll(newContact.phones);
        uniquePhones.remove("empty");
        existing.phones = new ArrayList<>(uniquePhones);
        Collections.sort(existing.phones);
    }

    private ArrayList<ContactData> readInput(String input) {
        ArrayList<ContactData> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(input);

        while (scanner.hasNext()) {
            String name = scanner.next();
            String birthDate = scanner.next();
            int p = scanner.nextInt(); // Number of phones
            List<String> phones = new ArrayList<>();
            for (int i = 0; i < p; i++) {
                String phone = scanner.next();
                if (phone.equals("empty")) phone = "";
                phones.add(phone);
            }
            int lastUpdateTime = scanner.nextInt();
            ContactData contact = new ContactData(name, birthDate, phones, lastUpdateTime);
            contacts.add(contact);
        }

        scanner.close();
        return contacts;
    }

    private String createStringOutput(ArrayList<ContactData> contacts) {
        StringBuilder sb = new StringBuilder();
        for (ContactData contact : contacts) {
            sb.append(contact.name).append(" ")
                    .append(contact.birthDate).append(" ")
                    .append(String.join(" ", contact.phones)).append(" ")
                    .append(contact.lastUpdateTime).append(" ");
        }
        return sb.toString();
    }
}
