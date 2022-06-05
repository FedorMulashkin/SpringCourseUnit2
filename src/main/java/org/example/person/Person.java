package org.example.person;

public class Person implements Comparable<Person>{
    enum Sex{
        MALE,
        FEMALE
    }
    private String name;
    private String surname;
    private Sex sex;
    private int age;

    public Person() {
    }

    public Person(String name, String surname, String sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = Sex.valueOf(sex);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        if (!getName().equals(person.getName())) return false;
        if (!getSurname().equals(person.getSurname())) return false;
        return getSex().equals(person.getSex());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getSex().hashCode();
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public int compareTo(Person o) {
        // Compares persons by age
        return Integer.compare(this.age, o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
