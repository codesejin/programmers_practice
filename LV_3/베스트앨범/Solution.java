package LV_3.베스트앨범;

import java.util.*;


class Song {
    private String genre;
    private int plays;
    private int index;

    public Song(String genre, int plays, int index) {
        this.genre = genre;
        this.plays = plays;
        this.index = index;
    }

    public String getGenre() {
        return genre;
    }

    public int getPlays() {
        return plays;
    }

    public int getIndex() {
        return index;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 총 합산 재생 횟수를 저장하는 Map
        Map<String, Integer> genreTotalPlays = new HashMap<>();
        // 장르별 노래 리스트를 개별로 저장하는 Map
        Map<String, List<Song>> genreSongs = new HashMap<>();

        // 데이터 초기화
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

        // 장르별 노래 리스트 출력
        for (Map.Entry<String, List<Song>> entry : genreSongs.entrySet()) {
            String genre = entry.getKey();
            List<Song> songs = entry.getValue();
            System.out.println("Genre: " + genre);
            System.out.println("songs List: " + songs);
            for (Song song : songs) {
                System.out.println("  Song: " + song.getIndex() + ", Plays: " + song.getPlays());
            }
        }


        // 재생 횟수가 높은 장르 순으로 정렬
        List<String> sortedGenres = new ArrayList<>(genreTotalPlays.keySet());
        System.out.println("sortedGenres : " + sortedGenres);
        sortedGenres.sort((a, b) -> genreTotalPlays.get(b).compareTo(genreTotalPlays.get(a)));

        // 최대 2개의 노래를 선택하여 결과를 저장
        List<Integer> resultList = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<Song> songs = genreSongs.get(genre);
            songs.sort((a, b) -> a.getPlays() == b.getPlays() ? a.getIndex() - b.getIndex() : b.getPlays() - a.getPlays());

            for (int i = 0; i < Math.min(songs.size(), 2); i++) {
                resultList.add(songs.get(i).getIndex());
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
        Solution T = new Solution();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        T.solution(genres, plays);
    }
}
