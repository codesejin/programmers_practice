package LV_2.타겟_넘버.DFS;

//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data, Node left, Node right) {
//        this.data = data;
//        this.left = left;
//        this.right = right;
//    }
//}
public class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    // 깊이 우선 탐색
    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){ // 마지막 노드 까지 탐색한 경우
            if(target == sum) answer++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(s.solution(numbers, target));
    }
}


//class Node:
//    def __init__(self, data, left = Node, right = Node):
//        self.data = data # 데이터
//        self.left = left # 왼쪽 노드
//        self.right = right # 오른쪽 노드
//def dfs(node: Node):
//    # 해당 노드가 존재하지 않으면 0반환(없음)
//    if(node == Node) : return 0;
//    sum = node.data
//    sum += dfs(node.left) # 왼쪽 먼저 순회
//    sum += dfs(node.right) # 오른쪽 순회
//    return sum # 최종합 반환
//def dfs_2(node: Node):
//    # 해당 노드가 존재하지 않으면 0반환(없음)
//    if(node == Node) : return 0;
//     # 순회하면서 더해서 최종합 반환
//    return sum + def(node.left) + dfs(node.right)


//class Node:
//    def __init__(self, data, child = []):
//        self.data = data # 데이터
//        self.child = child # 연결된 노드들
//def dfs(node: Node):
//    # 해당 노드가 존재하지 않으면 0반환(없음)
//    if(node == Node) : return 0;
//    sum = node.data
//    # 자식 목록을 순회하면서 먼저 값을 더해서 가져오게 함
//    for next in node.child:
//        sum += dfs(next)
//    return sum # 최종합 반환