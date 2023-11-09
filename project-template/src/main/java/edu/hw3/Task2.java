package edu.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task2 {
    public static String[] clusterize(String brackets){
        if(brackets == null){
            return new String[]{"Incorrect data"};
        }
        List<String> blocksBrackets = new ArrayList<>();
        Stack<Character> bracketStack = new Stack<>();
        StringBuilder sequenceBrackets = new StringBuilder();

        for(var elem: brackets.toCharArray()){
            if(elem != ')' && elem != '('){
                return new String[]{"Incorrect data"};
            }
            else if(!bracketStack.empty() && bracketStack.lastElement() == '(' && elem == ')'){
                sequenceBrackets.append(elem);
                bracketStack.pop();
                if(bracketStack.empty()){
                    blocksBrackets.add(sequenceBrackets.toString());
                    sequenceBrackets = new StringBuilder();
                }
            }
            else{
                bracketStack.push(elem);
                sequenceBrackets.append(elem);
            }
        }

        if(!bracketStack.empty()){
            return new String[]{"Incorrect data"};
        }

        String[] blocksBracketsArray = new String[blocksBrackets.size()];
        blocksBrackets.toArray(blocksBracketsArray);
        return blocksBracketsArray;
    }

}
