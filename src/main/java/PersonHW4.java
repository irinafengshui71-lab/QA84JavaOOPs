public class PersonHW4 {
    private String PersonHW4;
    private int id;
    private int age;

    public PersonHW4(){}

    public PersonHW4(String Name, int id, int age){
        super();
        this.PersonHW4 = PersonHW4;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        if (name != null)
            PersonHW4 = PersonHW4;
    }

    public void setId(int id) {
        if (id > 0)
        this.id = id;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;

    }
        @Override
        public String toString() {
            String str = "Name: " + this.PersonHW4 + "id " + this.id + "age " + this.age;

            return super.toString();
        }

}
