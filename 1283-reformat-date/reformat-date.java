class Solution {
    public String reformatDate(String date) {
        
        String[] d = date.split(" ");
        
        int dd = Integer.parseInt(d[0].substring(0 , d[0].length()-2));
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        List<String> mList = Arrays.asList(month);
        int mm = mList.indexOf(d[1])+1;
        int yyyy = Integer.parseInt(d[2]);

        return yyyy + "-" + String.format("%02d",mm) + "-" + String.format("%02d" , dd);
    }
}