/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p9_nm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author vsa
 */
public class P9_nm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        List<Ucet> ls = new ArrayList<>();
        ls.add(new Ucet("U001", 100));
        ls.add(new Ucet("U002", 200));
        ls.add(new Ucet("U003", 300));
        ls.add(new Ucet("U004", 400));
                
        Stream<String> lines = Files.lines(Paths.get("data.txt"));
        lines.filter(l -> !l.isEmpty()).forEach(l->System.out.println(l));
    }
}
