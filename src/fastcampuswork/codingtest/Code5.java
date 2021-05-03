package fastcampuswork.codingtest;

public class Code5 {

	public static String solution(String s) {

		int[] filebytes = new int[4];

		String[] fileinfos = s.split("\n");
		for (String fileinfo : fileinfos) {
			String[] file = fileinfo.split(" ");

			String filetype = file[0].substring(file[0].lastIndexOf(".") + 1);
			String filebyte = file[1].substring(0, file[1].lastIndexOf("b"));

			switch (filetype) {
			case "mp3":
			case "aac":
			case "flac":
				filebytes[0] += Integer.parseInt(filebyte);
				break;
			case "jpg":
			case "bmp":
			case "gif":
				filebytes[1] += Integer.parseInt(filebyte);
				break;
			case "mp4":
			case "avi":
			case "mkv":
				filebytes[2] += Integer.parseInt(filebyte);
				break;
			default:
				filebytes[3] += Integer.parseInt(filebyte);
				break;
			}
		}

		String answer = "music " + filebytes[0] + "b\n" + "images " + filebytes[1] + "b\n" + "movies " + filebytes[2]
				+ "b\n" + "other " + filebytes[3] + "b";
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("mv.song.mp3 11b\r\n" + "greatSong.flac 1000b\r\n" + "not3.txt 5b\r\n"
				+ "video.mp4 200b\r\n" + "game.exe 100b\r\n" + "mov!e.mkv 10000b\r\n"));
		/*
		 * “music 1011b images 0b movies 10200b other 105b”
		 */
	}

}