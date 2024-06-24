package medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {

    public static void main(String[] args) {
        SimplifyPath path = new SimplifyPath();
        String test = "/.../a/../b/c/../d/./";

        System.out.println(path.simplifyPath(test));
    }

    public String simplifyPath(String path) {
        StringBuilder res = new StringBuilder();
        // will use deque as a stack again to keep track of the directories;
        Deque<String> stack = new ArrayDeque<>();

        //this array will store all the individual directories in the path:
        String[] directories = path.split("/");
        for (String dir: directories) {
            //if the directory is empty or ".", we can simply continue:
            if (dir.isEmpty() || dir.equals(".")){
                continue;
            }
            /* if the directory is "..", we need to backtrack
            by popping the last directory from the stack: */
            if (dir.equals("..")){
                stack.pop();
                continue;
            }
            // otherwise, we push the directory onto the stack:
            stack.push(dir);
        }
        /* now, we need to construct the final simplified path
        by popping all the directories from the stack: */
        while (!stack.isEmpty()){
            res.append("/");
            res.append(stack.pollLast());
        }

        // if the simplified path is empty, return "/":
        if (res.length() == 0){
            return "/";
        }
        return res.toString();
    }
}
