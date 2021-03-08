package bai13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_lien_tiep_co_do_dai_lon_nhat;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Scanner;

public class SubStringIncreasinglyMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        // Find the maximum consecutive increasingly ordered substring
        for (int i = 0; i < string.length(); i++) { 		// single loop
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear(); // Simple statement
            }

            list.add(string.charAt(i)); // Simple statement

            if (list.size() > max.size()) { // Simple statement
                max.clear();
                max.addAll(list);
            }
        }

        // Display the maximum consecutive
        // increasingly ordered substring
        for (Character ch: max) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println();
    }
    }



