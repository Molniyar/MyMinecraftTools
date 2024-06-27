import java.util.Scanner;

public class CustomInstrumentsGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите ник игрока (которому будет выдаваться предмет)");
        String nickname = input.nextLine();

        System.out.println("введите инструмент который будете выдавать");
        String instrumentIn = input.nextLine();
        String instrument = "minecraft:";
        instrumentIn = instrumentIn.trim();
        String[] split = instrumentIn.split(" ");
        switch (split[0]){
            case "деревянный", "деревянная"  : instrument = instrument + "wooden";   break;
            case "каменный", "каменная"      : instrument = instrument + "stone";    break;
            case "железный", "железная"      : instrument = instrument + "iron";     break;
            case "золотой", "золотая"        : instrument = instrument + "golden";   break;
            case "незеритовый", "незеритовая": instrument = instrument + "netherite";break;
            default                          : instrument = instrument + "diamond";
        }
        instrument = instrument + "_";
        switch (split[1]){
            case "лопата": instrument = instrument + "shovel";break;
            case "топор" : instrument = instrument + "axe";   break;
            case "мотыга": instrument = instrument + "hoe";   break;
            case "меч"   : instrument = instrument + "sword"; break;
            default      : instrument = instrument + "pickaxe";

        }

        System.out.println("будет ли ваш предмет зачарован?");
        String isEnchantmented = input.nextLine();

        String enchantments = "";

        if (isEnchantmented.trim().equals("да") || isEnchantmented.trim().equals("будут") || isEnchantmented.trim().equals("конечно")){
            enchantments = enchantments + "Enchantments:[";

            System.out.println("ввведите первое зачарование (если зачарования не нужны, оставьте строку пустой)");
            String firstEnchantmentIn = input.nextLine();
            if (!firstEnchantmentIn.isEmpty()){
                enchantments = enchantments + "{id\"minecraft:";
            }
            switch (firstEnchantmentIn){
                case "острота"      : enchantments = enchantments + "sharpness";  break;
                case "заговор огня" : enchantments = enchantments + "fire_aspect";break;
                case "починка"      : enchantments = enchantments + "mending";    break;
                case "прочность"    : enchantments = enchantments + "unbreaking"; break;
                case "удача"        : enchantments = enchantments + "luck";       break;
                case "добыча"       : enchantments = enchantments + "looting";    break;
                case "отбрасывание" : enchantments = enchantments + "punch";      break;
                case "эффективность": enchantments = enchantments + "efficiency"; break;
                case "отдача"       : enchantments = enchantments + "knockback";  break;
            }
            if (!firstEnchantmentIn.isEmpty()) {
                System.out.println("введите уровень зачарования");
                int lvl1 = input.nextInt();
                enchantments = enchantments + "\", lvl:" + lvl1 + "}";
            }
            boolean isTrue = true;

            for (int i = 0; isTrue; i++){
                System.out.println("введите " + (i + 2) + "-e зачарование (введите stop если ввели достаточные зачарования)");
                input.nextLine();
                String enchantmentIn = input.nextLine();
                boolean isEnchantment = false;

                switch (enchantmentIn){
                    case "острота"      : enchantments = enchantments + ",{id\"minecraft:sharpness";  isEnchantment = true;break;
                    case "заговор огня" : enchantments = enchantments + ",{id''minecraft:fire_aspect";isEnchantment = true;break;
                    case "починка"      : enchantments = enchantments + ",{id''minecraft:mending";    isEnchantment = true;break;
                    case "прочность"    : enchantments = enchantments + ",{id''minecraft:unbreaking"; isEnchantment = true;break;
                    case "удача"        : enchantments = enchantments + ",{id''minecraft:luck";       isEnchantment = true;break;
                    case "добыча"       : enchantments = enchantments + ",{id''minecraft:looting";    isEnchantment = true;break;
                    case "отбрасывание" : enchantments = enchantments + ",{id''minecraft:punch";      isEnchantment = true;break;
                    case "эффективность": enchantments = enchantments + ",{id''minecraft:efficiency"; isEnchantment = true;break;
                    case "отдача"       : enchantments = enchantments + ",{id''minecraft:knockback";  isEnchantment = true;break;
                    case "stop"         : isTrue = false;                                                                  break;

                }
                if (isEnchantment == true) {
                    System.out.println("введите уровень зачарования");
                    int lvl1 = input.nextInt();
                    enchantments = enchantments + "\",lvl:" + lvl1 + "}";
                }
            }
            enchantments = enchantments + "]";


        }

        System.out.println("введите название инструмента");
        String itemNameIn = input.nextLine();
        String itemName = "display{name['[{text:";
        itemName = itemName + "\"" + itemNameIn + "\"";

        System.out.println("введите цвет текста");
        String colorIn = input.nextLine();
        String color = "";

        switch (colorIn){
            case "коричневый"                : color = "\"dark_red\"";break;
            case "красный"                   : color = "\"red\"";break;
            case "оранжевый", "золотой"      : color = "\"gold\"";break;
            case "желтый", "жёлтый"          : color = "\"yellow\"";break;
            case "зелёный"                   : color = "\"dark_green\"";break;
            case "лаймовый", "светло зелёный": color = "\"green\"";break;
            case "голубой"                   : color = "\"aqua\"";break;
            case "тёмно-голубой"             : color = "\"dark_aqua\"";break;
            case "синий"                     : color = "\"blue\"";break;
            case "тёмно-синий"               : color = "\"dark_blue\"";break;
            case "фиолетовый"                : color = "\"dark_purple\"";break;
            case "розовый"                   : color = "\"light_purple\"";break;
            case "белый"                     : color = "\"white\"";break;
            case "светло-серый"              : color = "\"gray\"";break;
            case "серый"                     : color = "\"dark_gray\"";break;
            case "чёрный"                    : color = "\"black\"";break;
        }

        itemName = itemName + ",\"italic\":false,\"color\":" + color;
        itemName = itemName + "}]']}";

        System.out.println("/give" + " " + nickname + " " + instrument + "{" + enchantments + itemName + "}");
    }
}
