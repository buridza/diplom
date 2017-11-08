package com.it.JD01.classAndObj.tasksA.аbiturient;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Denis on 29.10.2017.
 */
public class Abiturient {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String adress;
    private int phoneNumber;
    private int[] marks;
    public static ArrayList<Abiturient> allAbiturient = new ArrayList<>();
    private int result;
    public Abiturient() {
    }

    public Abiturient(String name, String surname, String patronymic, String adress, int phoneNumber, int[] marks) {

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.marks = marks;
        for (int i = 0; i < marks.length; i++) {
            result+=marks[i];
        }
        this.id = this.hashCode();
        allAbiturient.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getMarks() {
        return marks;
    }
    public int getMarks(int index){
        return marks[index];
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public int getResult(){
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Abiturient that = (Abiturient) o;

        if (id != that.id) return false;
        if (phoneNumber != that.phoneNumber) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (patronymic != null ? !patronymic.equals(that.patronymic) : that.patronymic != null) return false;
        if (adress != null ? !adress.equals(that.adress) : that.adress != null) return false;
        return Arrays.equals(marks, that.marks);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + phoneNumber;
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
