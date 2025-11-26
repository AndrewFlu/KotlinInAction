package ch02_language_basis.language_bases;

public class PersonDemo {
    public static void main(String[] args) {
        Person robert = new Person("Robert", true);
        System.out.println("name: " + robert.getName());
        System.out.println("is student?: " + robert.isStudent());
        robert.setStudent(false); // выпускной
        System.out.println("is student?: " + robert.isStudent());
    }
}
