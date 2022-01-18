import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        List<File> list = new ArrayList<>();
        
        for(String file:files) {
            StringBuilder head = new StringBuilder();
            StringBuilder number = new StringBuilder();
            StringBuilder tail = new StringBuilder();
            for(int i=0; i<file.length(); i++) {
                char c = file.charAt(i);
                if(!Character.isDigit(c)) {
                    if(number.length() == 0) head.append(c);
                    else tail.append(c);
                } else {
                    if(tail.length() == 0) number.append(c);
                    else tail.append(c);
                }
            }
            
            list.add(new File(file, head.toString().toUpperCase(), Integer.parseInt(number.toString())));
        }
        
        Collections.sort(list, new Comparator<File>() {
            public int compare(File a, File b) {
                return a.number - b.number;
            }
        });
        
        Collections.sort(list, new Comparator<File>() {
            public int compare(File a, File b) {
                return a.head.compareTo(b.head);
            }
        });
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i).fileName;
        }
        return answer;
    }
}

class File {
    String fileName;
    String head;
    int number;
    
    public File(String fileName, String head, int number) {
        this.fileName = fileName;
        this.head = head;
        this.number = number;
    }
}
