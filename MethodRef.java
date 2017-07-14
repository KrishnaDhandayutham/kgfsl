package com.mycompany.app;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class MethodRef {
    public static void main(String[] args) {
        List<Color> colorList = Arrays.asList(new Color("Red"), new Color("Green"), new Color("Blue"),
                new Color("Yellow"));
        //List<String> colorNameList = MethodReference3.applyFunction(colorList, color->color.getName());
        //Reference to an instance method of an arbitrary object of a particular type -> containingType::methodName
        List<String> colorNameList = MethodReference3.applyFunction(colorList, Color::getName);
        System.out.println(colorNameList);
    }

    public static List<String> applyFunction(List<Color> list, Function<Color, String> function) {
        List<String> returnList = new ArrayList<>();
        list.forEach(x -> returnList.add(function.apply(x)));
        return returnList;
    }
}

class Color {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}