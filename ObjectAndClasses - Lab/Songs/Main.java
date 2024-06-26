import ObjectAndClasses.Songs.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {

            //прочитаме от конзолата input, който запазваме в масив -> "favourite_DownTown_3:14" -> ["favourite", "DownTown", "3:14"]
            String[] data = scanner.nextLine().split("_");

            //прочитаме си елементите от масива
            String typeList = data[0];
            String name = data[1];
            String time = data[2];

            //създаваме празен обект от класа Song
            Song currentSong = new Song();//typeList, name, time

            //задаваме стойности на полетата от обекта спрямо прочетения инпут

            //ако нямаме конструктор
            currentSong.setTypeList(typeList);
            currentSong.setName(name);
            currentSong.setTime(time);

            songs.add(currentSong);

        }

        String typeListToShow = scanner.nextLine();

        if(typeListToShow.equals("all")){
            for(Song song : songs){
                System.out.println(song.getName());
            }
        }else {
            for (Song song : songs){
                if(song.getTypeList().equals(typeListToShow)){
                    System.out.println(song.getName());
                }
            }
        }


    }
}
