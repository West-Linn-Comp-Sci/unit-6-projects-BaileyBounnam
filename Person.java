public class Person
{
    private int myAge;
    private String myName;
    public Person(int ageTemp, String nameTemp)
    {
        myAge = ageTemp;
        myName=nameTemp;
    }
    public String getName(){
        return this.myName;
    }
    public int getAge(){
        return this.myAge;
    }
}