import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
     /*  if (20 > 12){                         //Урок 5
           System.out.println("20 больше 12");
       }
       int x = 35;
       int y = 15;
       if (x > y);{
            System.out.println("x больше y");
        }
        if (10 < 5){
            System.out.println("10 меньше 5");
        }
        else {
            System.out.println("10 больше 5");
        }
        int day = 35;
        if(day < 27){
            System.out.println("Понидельник");
        }
        else{
            System.out.println("Среда");
        }
        if (day < 22){
            System.out.println("Вторник");
        }
        else if (day < 33){
            System.out.println("Четверг");
        }
        else{
            System.out.println("Пятница");
        }
        String resault = (day <11)?"Суббота!" : "Воскресенье" ;
        System.out.println(resault);*/

        /* int month = 7;
        switch (month) {
            case 1: {
                System.out.println("January");
                break;
            }
            case 2: {
                System.out.println("February");
                break;
            }
            case 3: {
                System.out.println("March");
                break;
            }
            case 4: {
                System.out.println("April");
                break;
            }
            case 5: {
                System.out.println("May");
            }
            case 6: {
                System.out.println("June");
                break;
            }
            case 7: {
                System.out.println("July");
                break;
            }
            default:
                System.out.println("September");

        } */

       /* int i = 0;
        while (i < 6) {
            System.out.println(i);
            i++;
        }*/
        /*int x = 0;
        do {
            System.out.println(x);
            x++;
        }while(x < 6);
        */

       /* for(int i = 0; i < 6; i++){
            System.out.println(i);
        }*/
       /* for (int i = 0; i <= 10; i = i + 2){
            System.out.println(i);
        }
        */
        /*for(int i = 0; i <= 10;  i = i + 2){
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }*/
      /*  for(int i = 0; i <= 10;  i = i + 2) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }*/

        /*int i = 0;
        while (i < 10){
            if (i == 4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }*/ //Домашнее задание
/* //№1 int x = 15;
        int y = 20;
        if (x == 20) {
            System.out.println("x");
        } else {
            System.out.println("y");
        }*/
        /*
/* //№2 int a = 5000;
        if (a < 5000){
            System.out.println("Скидка 10%");
        }
        else {
            System.out.println("Скидки нет");
        }*/
       /* int i = 5;
        while (i > 0) {
            System.out.print(i);
            i--;
        }*/

/* //i      for(int i = 0; i < 4;i++){
            for(int j = 0; j < 10;j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/

//ii
      /*  int z = 5;
        for(int i = 0; i < z; i++){
            for (int x = 0; x < i + 1; x++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//iii
        /*for(int i = 1; i <= 5; i++) {
            for (int a = i; a <= 4; a++) {
                System.out.print(" ");
            }
            for (int z = i; z > 0; z--) {
                System.out.print(z);
            }
            for (int x = 2; x <= i; x++) {
                System.out.print(x);
            }
            System.out.println();
        }*/
/* // 3
        int grade = 80;
        if (grade < 25){
            System.out.println("Ваша оценка - F");
        } else if (grade < 45) {
            System.out.println("Ваша оценка - E");
        } else if (grade < 50) {
            System.out.println("Ваша оценка - D");
        } else if (grade < 60){
            System.out.println("Ваша оценка - C");
        } else if (grade < 80){
            System.out.println("Ваша оценка -B");
        } else {
            System.out.println("Ваша оценка - A");
        }*/

/* //№4 for (int i = 5; i >= 1; i--) {
            System.out.print(i);
        }*/
/* //№6 int a = 2;
        int b = 4;
        for(int m = a; m <= b;m++)
        System.out.print(m);*/

/* //№8        int i = 5;         //Кажется я не правильно понял условие задачи,и вывел просто значение бонусов взависимости от класса
        while (i > 0) {
            System.out.println("Класс A: 50%");
            while (i >= 0) i++;{
                System.out.println("Класс B: 25%");
                while(i <= 0)i++;{
                    System.out.println("Класс C: 0%");
                    break;
                }
            }
        }*/
/* №9   int n = 12;
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        int z = 2, i = 2;
        while (i < n) {
            z = a + b;
            a = b;
            b = z;
            System.out.print(" " + z);
            i++;
        }*/
    }
}