import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }

    public static void effectMain() {
        Scanner input = new Scanner(System.in);
        System.out.print("введите любой эффект");
        String effect = input.nextLine();

        int low = 1;
        int high = 5;
        int random = low + (int) (Math.random() * (high - low + 1));
        String food = "";
        switch (random){
            case 1 -> food = "гнилую плоть";
            case 2 -> food = "золотое яблоко";
            case 3 -> food = "сушёную ламинарию";
            case 4 -> food = "тыквенный пирог";
            case 5 -> food = "светящиеся ягоды";
        }

        int lowblock = 1;
        int highblock = 10;
        int x = lowblock + (int) (Math.random() * (highblock - lowblock + 1));

        System.out.print("Поздравляем, теперь ");
        switch (x) {
            case 1 -> System.out.print("эффект под названием " + effect + " будет удалён из майнкрафта");
            case 2 -> System.out.print("эффект под названием " + effect + " будет иметь улучшенную версию");
            case 3 -> System.out.print("можно будет скрафтить рагу с эффектом под названием " + effect);
            case 4 -> System.out.print("можно будет сварить зелье с эффектом под названием " + effect);
            case 5 -> System.out.print("вы будете получать эффект под названием " + effect + " когда голодаете");
            case 6 -> System.out.print("вы будете получать эффект под названием " + effect + " когда едите " + food);
            case 7 -> System.out.print("text7");
            case 8 -> System.out.print("text8");
            case 9 -> System.out.print("text9");
            case 10 ->System.out.print("text10");
        }
    }

    public static void biomeMain() {
        Scanner input = new Scanner(System.in);
        System.out.println("Назовите любой биом:");
        String biome = input.nextLine();

        int small = 1;
        int big = 5;
        int z = small + (int) (Math.random() * (big - small + 1));
        String generation = "";
        switch (z){
            case 1 -> generation = "сломанная (парящие острова, проломан бедрок и т.д.)";
            case 2 -> generation = "равнинная";
            case 3 -> generation = "горная";
            case 4 -> generation = "океаническая";
            case 5 -> generation = "лесистая";
        }

        int low = 1;
        int high = 5;
        int random = low + (int) (Math.random() * (high - low + 1));
        String block = "";
        switch (random){
            case 1 -> block = "красный песок";
            case 2 -> block = "песок";
            case 3 -> block = "сухой " + randomColor() + " бетон";
            case 4 -> block = "наковальня";
            case 5 -> block = "капельник";
        }

        int low2 = 1;
        int high2 = 10;
        int random2 = low2 + (int) (Math.random() * (high2 - low2 + 1));
        String entityRandom = "";
        switch (random2){
            case 1  -> entityRandom = "визер скелет";
            case 2  -> entityRandom = "зомби";
            case 3  -> entityRandom = "фантом";
            case 4  -> entityRandom = "эндермен";
            case 5  -> entityRandom = "падающий блок (тип блока: " + block + " )";
            case 6  -> entityRandom = "скелет";
            case 7  -> entityRandom = "зомби житель";
            case 8  -> entityRandom = "гаст";
            case 9  -> entityRandom = "чешуйница";
            case 10 -> entityRandom = "разбойник";
        }


        int lowblock = 1;
        int highblock = 10;
        int x = lowblock + (int) (Math.random() * (highblock - lowblock + 1));

        System.out.print("Поздравляем, теперь ");
        switch (x) {
            case 1  -> System.out.print("в биоме под названием " + biome + " будет температура " + (Math.random() + Math.random()));
            case 2  -> System.out.print("биом под названием " + biome + " будет иметь улучшенную версию, которая будет спавниться вместо этого биома с шансом " + Math.rint(Math.random() * 100) + "%");
            case 3  -> System.out.print("в биоме под названием " + biome + " будет спавниться " + entityRandom);
            case 4  -> System.out.print("биом под названием " + biome + " будет удалён из майнкрафта");
            case 5  -> System.out.print("в биоме под названием " + biome + " будет спавниться новая структура с ловушками, сундуками и ценным лутом в них");
            case 6  -> System.out.print("в биоме под названием " + biome + " будет спавниться новая деревня");
            case 7  -> System.out.print("в биоме под названием " + biome + " будут спавниться новые деревья");
            case 8  -> System.out.print("биом под названием " + biome + " будет пустым");
            case 9  -> System.out.print("у биома под названием " + biome + " будет " + generation + " генерация");
            case 10 -> {
                if (biome.trim().equalsIgnoreCase("мрачные глубины") || biome.trim().equalsIgnoreCase("тёмные пещеры") || biome.trim().equalsIgnoreCase("тёмные глубины") || biome.trim().toLowerCase() == "грибные поля" || biome.trim().toLowerCase() == "грибной биом" || biome.trim().toLowerCase() == "грибной остров"){
                    System.out.print("теперь в биоме " + biome + " будут спавниться враждебные мобы");
                }
                else System.out.print("теперь в биоме " + biome + " не будут спавниться враждебные мобы");
            }
        }
    }
    public static void entityMain (){
        Scanner input = new Scanner(System.in);
        System.out.print("Назовите любого моба:");
        String entity = input.nextLine();

        String loot = "";
        String s = "";
        int lowE = 1;
        int highE = 8;
        int bb = lowE + (int) (Math.random() * (highE - lowE + 1));
        String smilthingTemplateType;
        switch (bb){
            case 1 -> smilthingTemplateType = "дюна";
            case 2 -> smilthingTemplateType = "око";
            case 3 -> smilthingTemplateType = "рыло";
            case 4 -> smilthingTemplateType = "чешуя";
            case 5 -> smilthingTemplateType = "шпиль";
            case 6 -> smilthingTemplateType = "вредина";
            case 7 -> smilthingTemplateType = "сборщик";
            case 8 -> smilthingTemplateType = "тишина";
        }
        int lowEnt = 1;
        int highEnt = 10;
        int b = lowEnt + (int) (Math.random() * (highEnt - lowEnt + 1));
        switch (b){
            case 1  -> loot = "золотой слиток";
            case 2  -> loot = "незеритовый слиток";
            case 3  -> loot = "шалкеровый ящик";
            case 4  -> loot = "алмаз";
            case 5  -> loot = "изумруд";
            case 6  -> loot = "трезубец";
            case 7  -> loot = "какао бобы";
            case 8  -> loot = "кузнечный шаблон (" + s + ")";
            case 9  -> loot = "незеритовое улучшение";
            case 10 -> loot = "кожаный шлем";
        }
        int lowEnts = 1;
        int highEnts = 10;
        int c = lowEnts + (int) (Math.random() * (highEnts - lowEnts + 1));
        String insteadEntity = "n";
        switch (c){
            case 1  -> insteadEntity = "коровы";
            case 2  -> insteadEntity = "кролика";
            case 3  -> insteadEntity = "крипера";
            case 4  -> insteadEntity = "чешуйницы";
            case 5  -> insteadEntity = "черепахи";
            case 6  -> insteadEntity = "магмового куба";
            case 7  -> insteadEntity = "эндермена";
            case 8  -> insteadEntity = "хоглина";
            case 9  -> insteadEntity = "поборника";
            case 10 -> insteadEntity = "падающего песка";
         }
        int no = 1;
        int yes = 10;
        int xx = no + (int) (Math.random() * (yes - no + 1));
        String biome = "";
        switch (xx) {
            case 1  -> biome = "грибном биоме";
            case 2  -> biome = "тайге";
            case 3  -> biome = "саванне";
            case 4  -> biome = "равнинах энда";
            case 5  -> biome = "долине душ";
            case 6  -> biome = "базальтовых дельтах";
            case 7  -> biome = "горах";
            case 8  -> biome = "тёплом океане";
            case 9  -> biome = "холодном океане";
            case 10 -> biome = "пустоте";
        }


        int lowEntity = 1;
        int highEntity = 10;
        int a = lowEntity + (int) (Math.random() * (highEntity - lowEntity + 1));
        System.out.print("Поздравляем, ");
        switch (a){
            case 1  -> System.out.print("теперь "   + entity + " будет удален(а) из майнкрафта");
            case 2  -> System.out.print("теперь "   + entity + " будет враждебен");
            case 3  -> System.out.print("теперь "   + entity + " будет спавниться вместо " + insteadEntity);
            case 4  -> System.out.print("теперь "   + entity + " будет спавниться в " + biome);
            case 5  -> System.out.print("теперь "   + entity + " будет перевернутым");
            case 6  -> System.out.print("теперь "   + entity + " будет радужным");
            case 7  -> System.out.print("теперь "   + entity + " будет мирным");
            case 8  -> System.out.print("теперь "   + entity + " будет летать");
            case 9  -> System.out.print("теперь с " + entity + " будет дропаться " + loot);
            case 10 -> System.out.print("теперь "   + entity + " будет способен ломать блоки");
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
    public static String randomColor() {
        int min = 1;
        int max = 16;
        int random = min + (int) (Math.random() * (max - min + 1));
        String randomColor = "";
        switch (random){
            case 1  -> randomColor = "чёрный";
            case 2  -> randomColor = "серый";
            case 3  -> randomColor = "светло-серый";
            case 4  -> randomColor = "белый";
            case 5  -> randomColor = "розовый";
            case 6  -> randomColor = "пурпурный";
            case 7  -> randomColor = "фиолетовый";
            case 8  -> randomColor = "красный";
            case 9  -> randomColor = "оранжевый";
            case 10 -> randomColor = "жёлтый";
            case 11 -> randomColor = "зелёный";
            case 12 -> randomColor = "голубой";
            case 13 -> randomColor = "синий";
            case 14 -> randomColor = "лаймовый";
            case 15 -> randomColor = "коричневый";
            case 16 -> randomColor = "бирюзовый";
        }
        return randomColor;
    }

}