import java.util.Objects;
import java.util.Scanner;


public class ArmorGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ник игрока (которому будет выдаваться броня)");
        String player = input.nextLine();

        //System.out.println("Введите материал брони (по умолчанию кожаная)");
        //String armorMaterialIn = input.nextLine();
        String armorMaterial = "leather";
        //if (armorMaterialIn == "iron")

        System.out.println("Введите тип брони (по умолчанию шлем)");
        String armorType = "helmet";
        String armorTypeIn = input.nextLine();
        if (armorTypeIn.toLowerCase().equals("шлем")){
            armorType = "helmet";
        }
        if (armorTypeIn.toLowerCase().equals("нагрудник") || armorTypeIn.toLowerCase().equals("куртка")){
            armorType = "helmet";
        }

        System.out.println("Выберите тип цвета");
        String chooseColour = input.nextLine();
        int colour = 0;
        if (chooseColour.toLowerCase().equals("выбор по цветам") || chooseColour.toLowerCase().equals("выбор")){
            System.out.println();
            String colourIn = input.nextLine();
            if (Objects.equals(colourIn, "красный")){
                colour = 16384044;
            }
            if (Objects.equals(colourIn, "синий")){
                colour = 4858;
            }
            if (Objects.equals(colourIn, "зелёный")){
                colour = 99584;
            }
            if (Objects.equals(colourIn, "жёлтый")){
                colour = 16772101;
            }
            if (Objects.equals(colourIn, "лаймовый")){
                colour = 392994;
            }
            if (Objects.equals(colourIn, "голубой")){
                colour = 385791;
            }
            if (Objects.equals(colourIn, "белый")){
                colour = 16777215;
            }
            if (Objects.equals(colourIn, "чёрный")){
                colour = 0;
            }
            if (Objects.equals(colourIn, "серый")){
                colour = 8026746;
            }
            if (Objects.equals(colourIn, "светло-серый")){
                colour = 11908533;
            }
            if (Objects.equals(colourIn, "оранжевый")){
                colour = 16747018;
            }
            if (Objects.equals(colourIn, "розовый")){
                colour = 16740597;
            }
            if (Objects.equals(colourIn, "фиолетовый")){
                colour = 11277567;
            }
        }
        else {
            System.out.println("Напишите цвет в цифровой кодировке");
            int colourIn = input.nextInt();
            colour = colourIn;
        }

        System.out.println("Напишите первое зачарование");
        String firstEmchantment = input.nextLine();
        System.out.println("Напишите уровень первого зачарования");


        String giveArmorCommand = "/give " + player + " " + "minecraft:" + armorMaterial + "_" + armorType + "{display:{color:" + colour + "}}";
        System.out.println(giveArmorCommand);

    }
}
