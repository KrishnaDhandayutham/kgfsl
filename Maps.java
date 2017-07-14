package com.mycompany.app;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Objects;
public class Maps
{
    public static void main(String args[])
    {
        Map<String,String> mk = new HashMap();
        mk.put("mok0","java8");
        mk.put("mk1","Android");
        mk.put("mk2","polaries");
        String res=mk.entrySet().stream()
                         .filter(map->"Android".equals(map.getValue()))
                         .map(map->map.getValue())
                         .collect(Collectors.joining());
        Optional<String> firstKey = mk.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(), "Android"))
                .map(Map.Entry::getKey).findFirst();

       if(firstKey.isPresent())
       {
           System.out.println(firstKey.get());
       }
       for(Map.Entry m:mk.entrySet())
        {
        System.out.println(m.getKey() +" " + m.getValue());
        }
       System.out.println("The value is:"+res);
    }
}