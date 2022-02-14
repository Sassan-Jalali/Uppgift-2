package Regex;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List.of("Map", "Argument", "Bike","Knife", "Spear", "Final", "Fantasy","Hymn", "Rhythm", "Lynx")
        .stream()
                .filter(word -> word.replaceAll("([^aeiouy]{2})","").length() >2)
                .forEach(System.out::println);



}


}
