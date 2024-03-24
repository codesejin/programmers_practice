package LV_3.베스트앨범;

import java.util.*;

public class Test {

    class Song {
        private String genre;
        private int plays;

        private int idx;

        public Song(String genre, int plays, int idx) {
            this.genre = genre;
            this.plays = plays;
            this.idx = idx;
        }

        public String getGenre() {
            return genre;
        }

        public int getPlays() {
            return plays;
        }

        public int getIdx() {
            return idx;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        // 장르별 노래 리스트를 저장하는 Map
        Map<String, List<Song>> genreSongs = new HashMap<>();

        Map<String, Integer> genreTotalPlays = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            if (!genreTotalPlays.containsKey(genre)) {
                genreTotalPlays.put(genre, 0);
                genreSongs.put(genre, new ArrayList<>());
            }
            genreTotalPlays.put(genre, genreTotalPlays.get(genre) + play);
            genreSongs.get(genre).add(new Song(genre, play, i));
        }
        System.out.println(genreTotalPlays);
        // 재생 횟수가 높은 장르 순으로 정렬
        List<String> sortedGenres = new ArrayList<>(genreTotalPlays.keySet());
        System.out.println(sortedGenres);
        sortedGenres.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return genreTotalPlays.get(b).compareTo(genreTotalPlays.get(a));
            }
        });
        System.out.println("sortedGenres : " + sortedGenres);

        // 최대 2개의 노래를 선택하여 결과를 저장
        List<Integer> resultList = new ArrayList<>();

        for (String genre : sortedGenres) {
            System.out.println("장르 : " + genre);
            List<Song> songs = genreSongs.get(genre);
            for (Song song:songs) {
                System.out.println("리스트 : " + song.genre +"  " + song.plays);
            }
            songs.sort(new Comparator<Song>() {
                @Override
                public int compare(Song a, Song b) {
                    // 만약 두 노래의 재생횟수가 같다면, 각 노래의 인덱스에 따라 오름차순 정렬
                    // 그렇지 않다면 내림차순 정렬
                    return a.getPlays() == b.getPlays() ? a.getIdx() - b.getIdx() : b.getPlays() - a.getPlays();
                }
            });

            for (int i = 0; i < Math.min(songs.size(), 2); i++) {
                resultList.add(songs.get(i).getIdx());
            }
        }
        // 결과를 int 배열로 변환
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Test test = new Test();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"}; // 고유번호 i
        int[] plays = {500, 600, 150, 800, 2500}; // 고유 번호가 I가 재생된 횟수
        test.solution(genres, plays);
    }
}
