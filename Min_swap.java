import java.util.HashMap;
class Min_swap {
public static void main(String[] args) {
int arr[] = new int[] { 1, 4, 5, 2,3 };
int count=0;

boolean isVisited[] = new boolean[arr.length + 1];
HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
for (int i = 1; i < isVisited.length; i++) {
map.put(i, arr[i-1]);
}
for (int k = 1; k <= map.size(); k++) {
int nextNode;
if (isVisited[k] == false) {
isVisited[k] = true;
if (k == map.get(k)) {
continue;
} 
else {
int c = map.get(k);
while (!isVisited[c]) 
{
isVisited[c] = true;
nextNode=map.get(c);
c = nextNode;
++count;
}
}
}
}
System.out.println(count);

}

}
