public class MainPerson {
    public static void main(String[] args){
        Person p1 = new Person();//neue Objekt persona//DEVAULT CONSTRUCTOR
        p1.setName("Irina Schäfer");
        p1.setId(12345);
        p1.setAge(55);
        System.out.println("Name: "+ p1.getName());
        System.out.println("Id: "+ p1.getId());
        System.out.println("Age: "+ p1.getAge());

        Person p2 = new Person();//2.neue Objekt persona
        p2.setName("Olga Gusst");
        p2.setId(15678);
        p2.setAge(45);
        System.out.println("Name: "+ p2.getName());
        System.out.println("Id: "+ p2.getId());
        System.out.println("Age: "+ p2.getAge());

    }

}
