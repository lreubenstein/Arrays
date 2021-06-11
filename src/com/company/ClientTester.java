package com.company;
import java.util.Arrays;
/* A company maintains client lists where each list is a sorted
array of clients stored in ascending order by client.  A client
may appear in more than one list, but will not appear more than
once in the same list.
Write method prefixMerge(), which takes 3 array parameters.  The
first 2 arrays, list1 and list2, represent existing client lists.
It is possible that some clients are in both arrays.  The third
array, result, has been instantiated to a length that is no longer
than either of the other 2 arrays and initially contains null
values.  Method prefixMerge() merges the lists in ascending order
with no duplicates until all positions of result are filled.  Clients
who appear in both list1 and list2 will appear at most once in result.
You must use compareClient() in your solution and you may not create
any additional arrays.
 */
public class ClientTester {
    // fills result with clients merged from the beginning of
    // list1 and list2;
    // result contains no duplicates and is sorted in ascending
    // order by customer
    // precondition: result.length > 0
    //               list1.length > result.length;
    //               list1 contains no duplicates
    //               list2.length > result.length;
    //               list2 contains no duplicates
    //               list1 and list2 are sorted in ascending order
    //               by client
    // postcondition: list1 and list2 are not modified
   /* public static void prefixMerge(Client [] list1, Client [] list2,
                                   Client[] result){
        int x1 = list1.length;
        int x2 = list2.length;
        int x3 = result.length;
        int a = 0, b = 0, c = 0;
        while (c < x3 && a < x1 && b < x2){
            int d = list1[a].compareClient(list2[b]);

            if(d>0){
                if (c ==0 || result[c-1].compareClient(list2[b])!=0) {
                    result[c] = list2[b];
                    c++;
                }
                b++;
            }
            else if (d < 0){
                if (c == 0 || result[c-1].compareClient(list1[a])!=0) {
                    result[c] = list1[a];
                    c++;
                }
                a++;
            }
            else {
                result[c] = list1[a];
                a++;
                b++;
                c++;
            }
        }
        while (a < x1 && c < x3){
            if(c == 0 || result[c-1].compareClient(list1[a])!=0){
                result[c]=list1[a];
                c++;
            }
            a++;
        }
        while (b < x2 && c < x3){
            if(c == 0 || result[c-1].compareClient(list2[b])!=0){
                result[c]=list2[b];
                c++;
            }
            b++;
        }

    }*/
    public static void prefixMerge(Client [] list1, Client [] list2,
                                   Client[] result){

        int x3 = result.length;
        int a = 0, b = 0, c = 0;
        while (c < x3 ){
            int d = list1[a].compareClient(list2[b]);

            if(d>0){
                result[c] = list2[b];
                b++;
            }
            else if (d < 0){
                result[c] = list1[a];
                a++;
            }
            else {
                result[c] = list1[a];
                a++;
                b++;
            }
            c++;

        }



    }
    public static void main(String [] args){
        Client c1 = new Client("Anton", 101);
        Client c2 = new Client("Bradley", 102);
        Client c3 = new Client("Bradley", 103);
        Client c4 = new Client("Cho", 104);
        Client c5 = new Client("Dahl", 105);
        Client c6 = new Client("Edgerton", 106);
        Client c7 = new Client("Edgerton", 107);
        Client c8 = new Client("Fleetwood", 108);

        Client [] list1 = {c1,c3,c4,c5,c7,c8};
        Client [] list2 = {c2, c3, c5, c6, c7};
        Client [] list3 = {c3,c5,c6};


        Client [] result1 = new Client[5];
        prefixMerge(list1,list2,result1);
        System.out.println(Arrays.toString(result1));

        Client [] result2 = new Client[3];
        prefixMerge(list2,list3,result2);
        System.out.println(Arrays.toString(result2));

        Client [] result3 = new Client[3];
        prefixMerge(list3,list1,result3);
        System.out.println(Arrays.toString(result3));


    }
}
