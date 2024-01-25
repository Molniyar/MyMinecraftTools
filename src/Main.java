import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowblock = 1;
        int highblock = 3;
        int x = lowblock + (int) (Math.random() * (highblock - lowblock + 1));
        if (x == 1) {
            blockMain();
        }
        if (x == 2) {
            itemMain();
        }
        if (x == 3) {
            entityMain();
        }
    }

    public static void biomeMain (){

    }
    public static void entityMain (){
        Scanner input = new Scanner(System.in);
        System.out.print("Назовите любого моба:");
        String e = input.nextLine();


        String i = "no";
        String s = "e";
        int lowE = 1;
        int highE = 8;
        int bb = lowE + (int) (Math.random() * (highE - lowE + 1));
        String ss = "ss";
        switch (bb){
            case 1 -> ss = "дюна";
            case 2 -> ss = "око";
            case 3 -> ss = "рыло";
            case 4 -> ss = "чешуя";
            case 5 -> ss = "шпиль";
            case 6 -> ss = "вредина";
            case 7 -> ss = "сборщик";
            case 8 -> ss = "тишина";
        }
        int lowEnt = 1;
        int highEnt = 10;
        int b = lowEnt + (int) (Math.random() * (highEnt - lowEnt + 1));
        switch (b){
            case 1  -> i = "золотой слиток";
            case 2  -> i = "незеритовый слиток";
            case 3  -> i = "шалкеровый ящик";
            case 4  -> i = "алмаз";
            case 5  -> i = "изумруд";
            case 6  -> i = "трезубец";
            case 7  -> i = "какао бобы";
            case 8  -> i = "кузнечный шаблон (" + s + ")";
            case 9  -> i = "незеритовое улучшение";
            case 10 -> i = "кожаный шлем";
        }
        int lowEnts = 1;
        int highEnts = 10;
        int c = lowEnts + (int) (Math.random() * (highEnts - lowEnts + 1));
        String f = "n";
        switch (c){
            case 1  -> f = "коровы";
            case 2  -> f = "кролика";
            case 3  -> f = "крипера";
            case 4  -> f = "чешуйницы";
            case 5  -> f = "черепахи";
            case 6  -> f = "магмового куба";
            case 7  -> f = "эндермена";
            case 8  -> f = "хоглина";
            case 9  -> f = "поборника";
            case 10 -> f = "падающего песка";
         }
        int no = 1;
        int yes = 10;
        int xx = no + (int) (Math.random() * (yes - no + 1));
        String biome = "n";


        int lowEntity = 1;
        int highEntity = 10;
        int a = lowEntity + (int) (Math.random() * (highEntity - lowEntity + 1));
        System.out.print("Поздравляем, ");
        switch (a){
            case 1  -> System.out.print("теперь " + e + " будет удален(а) из майнкрафта");
            case 2  -> System.out.print("теперь " + e + " будет враждебен");
            case 3  -> System.out.print("теперь " + e + " будет спавниться вместо " + f);
            case 4  -> System.out.print("теперь " + e + " будет спавниться в");
            case 5  -> System.out.print("теперь " + e + " будет перевернутым");
            case 6  -> System.out.print("теперь " + e + " будет радужным");
            case 7  -> System.out.print("теперь " + e + " будет мирным");
            case 8  -> System.out.print("теперь " + e + " будет летать");
            case 9  -> System.out.print("теперь с " + e + " будет дропаться ");
            case 10 -> System.out.print("теперь " + e + " будет способен ломать блоки");
        }
    }
    public static void blockMain () {
        Scanner input = new Scanner(System.in);
        System.out.print("Назовите любой блок: ");
        String block = input.nextLine();
        String blockk = ("");
        int lowblock = 1;
        int highblock = 10;
        int b = lowblock + (int) (Math.random() * (highblock - lowblock + 1));
        switch (b){
            case 1  -> blockk = "весь дерн заменится";
            case 2  -> blockk = "все дубовые бревна заменятся";
            case 3  -> blockk = "вся земля заменится";
            case 4  -> blockk = "вся акациевая листва заменится";
            case 5  -> blockk = "весь камень заменится";
            case 6  -> blockk = "весь бедрок заменится";
            case 7  -> blockk = "вся лава заменится";
            case 8  -> blockk = "вся алмазная руда заменится";
            case 9  -> blockk = "все золотые блоки заменятся";
            case 10 -> blockk = "все алмазные блоки заменятся";
        }
        System.out.print("Поздравляем, ");
        int low = 1;
        int high = 10;
        int z = low + (int) (Math.random() * (high - low + 1));
        switch (z) {
            case 1  -> System.out.print("теперь " + block + " удалят из майнкрафта.");
            case 2  -> System.out.print("теперь тебе нельзя использовать " + block + ".");
            case 3  -> System.out.print("теперь " + blockk + " на " + block + ".");
            case 4  -> System.out.print("теперь " + block + " станет невидимым.");
            case 5  -> System.out.print("теперь " + block + " будет светиться.");
            case 6  -> System.out.print("теперь " + block + " будет иметь анимацию.");
            case 7  -> System.out.print("теперь " + block + " будет прозрачным.");
            case 8  -> System.out.print("теперь " + block + " будет иметь свои ступеньки и плиты.");
            case 9  -> System.out.print("теперь " + block + " можно будет есть как торт.");
            case 10 -> System.out.print("теперь " + block + " будет иметь физику.");
        }

    }
    public static void itemMain () {
        Scanner input = new Scanner(System.in);
        System.out.print("Назовите любой предмет: ");
        String item = input.nextLine();
        String c = "ничто";
        String s = "никто";
        String g = "нет";
        String xyz = "не";

        int lowOre = 1;
        int highOre = 18;
        int z = lowOre + (int) (Math.random() * (highOre - lowOre + 1));
        switch (z){
        case 1  -> xyz = "угольной руды";
        case 2  -> xyz = "угольноносного глубинного сланца";
        case 3  -> xyz = "медной руды";
        case 4  -> xyz = "меденосного глубинного сланца";
        case 5  -> xyz = "железной руды";
        case 6  -> xyz = "железооносного глубинного сланца";
        case 7  -> xyz = "лазуритовой руды";
        case 8  -> xyz = "лазуритоносного глубинного сланца";
        case 9  -> xyz = "редстоуновой руды";
        case 10 -> xyz = "редстоуноносного глубинного сланца";
        case 11 -> xyz = "золотой руды";
        case 12 -> xyz = "золотоносного глубинного сланца";
        case 13 -> xyz = "алмазной руды";
        case 14 -> xyz = "алмазоносного глубинного сланца";
        case 15 -> xyz = "изумрудной руды";
        case 16 -> xyz = "изумрудоносного глубинного сланца";
        case 17 -> xyz = "незер-кварцевой руды";
        case 18 -> xyz = "незерской золотой руды";
        }
        int low = 1;
        int high = 5;
        int y = low + (int) (Math.random() * (high - low + 1));
        switch (y){
        case 1 -> g = "в деревнях";
        case 2 -> g = "у спавнеров";
        case 3 -> g = "в аванпостах разбойников";
        case 4 -> g = "в затонувших кораблях";
        case 5 -> g = "в крепости энда";
        }
        int mi = 1;
        int ma = 10;
        int v = mi + (int) (Math.random() * (ma - mi + 1));
        switch (v){
            case 1 -> s = "лучника";
            case 2 -> s = "библиотекаря";
            case 3 -> s = "фермера";
            case 4 -> s = "инструментальщика";
            case 5 -> s = "бронника";
            case 6 -> s = "гончара";
            case 7 -> s = "картографа";
            case 8 -> s = "рыбака";
            case 9 -> s = "оружейника";
            case 10 -> s = "кожевника";
        }

        int min = 1;
        int max = 10;
        int b = min + (int) (Math.random() * (max - min + 1));
        c=switch (b){
        case 1  ->  "зомби";
        case 2  ->  "варденa";
        case 3  ->  "курицы";
        case 4  ->  "кролика";
        case 5  ->  "скелета";
        case 6  ->  "нюхача";
        case 7  ->  "летучей мыши";
        case 8  ->  "эндермена";
        case 9  ->  "визер-скелета";
        case 10 -> "трески";
        default -> "ошибка";
        };
        int minp = 1;
        int maxp = 64;
        int prise = minp + (int) (Math.random() * (maxp - minp + 1));
        String ff = "ff";
        if (prise > 1 && prise < 5)
            ff = "а";
        else if (prise > 4)
            ff = "ов";
        else ff = " ";
        System.out.print("Поздравляем, ");
        int minValue = 1;
        int maxValue = 15;
        int a = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        switch (a) {
            case 1  -> System.out.print("теперь " + item + " будет удален(а) из майнкрафта.");
            case 2  -> System.out.print("теперь " + item + " будет встечаться в сундуках " + g + ".");
            case 3  -> System.out.print("теперь тебе нельзя использовать " + item + ".");
            case 4  -> System.out.print("теперь " + item + " будет выпадать из " + c + ".");
            case 5  -> System.out.print("теперь " + item + " будет использоваться для создания блока.");
            case 6  -> System.out.print("теперь " + item + " будет появляться в бонусном сундуке.");
            case 7  -> System.out.print("теперь " + item + " можно будет купить у " + s + " за " + prise + " изумруд" + ff + ".");
            case 8  -> System.out.print("теперь " + item + " будет использоваться для создания брони.");
            case 9  -> System.out.print("теперь " + item + " будет использоваться для создания оружия. ");
            case 10 -> System.out.print("теперь " + item + " будет иметь анимацию.");
            case 11 -> System.out.print("теперь " + item + " будет иметь перевёрнутую текстуру.");
            case 12 -> System.out.print("теперь " + item + " будет иметь невидимую текстуру.");
            case 13 -> System.out.print("теперь " + item + " можно будет съесть.");
            case 14 -> System.out.print("теперь " + item + " будет выкапываться нюхачом.");
            case 15 -> System.out.print("теперь " + item + " будет дропаться с " + xyz + ".");
        }
        input.close();
    }

}