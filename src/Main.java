import org.w3c.dom.ranges.Range;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static String inputFName;

    public static void main(String[] args) throws IOException {
        String InputFName="KRead";// KRead created for trening;
        Scanner sc=new Scanner(new File(inputFName));
        int k= sc.nextInt();

        String rf;
        int range=k%3;
        if(range==0)
            rf="G C V";
        else if(range==1)
            rf="V G C";
        else rf="C G V";
        System.out.println(rf);
        /* String OutputFName="RangeOfFlowers";
        String s=String.valueOf(range);

        Files.writeString(Path.of(outputFName), s);
         c\С ЗАДАНИЕМ НЕ СПРАВИЛСЯ)) ПО-МОЕМУ ОШИБКА В ВЫВОДЕ*/
    }
}