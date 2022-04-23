package com.enjoy.jack.test;

import org.springframework.web.method.HandlerMethod;

import java.util.*;

public class T {
    private int iii;
    public  int find(int n , int[][] flights, int src, int end, int k){
        int m = flights.length;
        Map<Integer,List<Integer>>  map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            List<Integer> list = map.getOrDefault(flights[i][0], new ArrayList<Integer>());
            list.add(flights[i][1]);

        }
        return 0;
    }

    class que{
        LinkedList<Integer> list = new LinkedList<>();
        void put(int i){
            while(!list.isEmpty()){
                if(list.getLast() < i){
                    list.removeLast();
                }
                list.add(i);
            }
        }
        void del(int i){
            if(list.getFirst() == i){
                list.removeFirst();
                list.pollLast();
                list.removeLast();
            }
        }
        int get(){
            int first = list.getFirst();
            return first;
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        char cc = '\u62DB';
        System.out.println((char)cc);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        StringBuffer sb = new StringBuffer();
        sb.append(')');
        new String(sb);
        sb.deleteCharAt(sb.length() - 1);
//        String s = new String();
//        s.setI(1);
//        System.out.println(s.getI());
        System.out.println();

    }



     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1]-o2[1];
                return o2[0] - o1[0];
            }
        });
        int[][] que = new int[people.length][2];
        que[0] = people[0];
        for (int i = 1; i<que.length; i++){
            int index = people[i][1];
            for(int j = index; j < i; j++){
                que[j+1] = que[j];
            }
            que[index] = people[i];
        }
        return que;

    }
    public int minMeetingRooms(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        int n = intervals.length;
        for (int i = 0; i < n; i++) {
            list.add(intervals[i]);
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int ans = 0;
        while (!list.isEmpty()){


            int pre = list.get(0)[1];
            list.remove(0);
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)[0] >= pre){

                    pre = list.get(i)[1];
                    list.remove(i);
                    i--;
                }else {
                    i++;
                }
            }
            ans++;

        }
        return ans;
    }
    private class TT{
        List<String> ttlist = new ArrayList<>();
        private String tname;
        private int iii;

    }
}
