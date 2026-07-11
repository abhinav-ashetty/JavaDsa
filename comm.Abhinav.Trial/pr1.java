

// https://prepinsta.com/infosys-sp-and-dse/coding-questions/

import java.util.*;

public class pr1 {

    static class Monster{
        int exp;
        int bonus;
        public Monster(int exp, int bonus){
            this.exp = exp;
            this.bonus = bonus;
        }
    }
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int exp = sc.nextInt();

        int[] mon_exp = new int[n];
        int[] mon_bonus = new int[n];
        Monster[] monsters = new Monster[n];
        for(int i = 0; i < n; i++){
            mon_exp[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            mon_bonus[i] = sc.nextInt();
        }   
        for(int i = 0; i < n; i++){
            monsters[i] = new Monster(mon_exp[i], mon_bonus[i]);
        }
        Arrays.sort(monsters, (a, b) -> a.exp - b.exp);
        int count = 0;
        for(Monster m : monsters){
            if(exp<m.exp) break;
            exp += m.bonus;
            count++;
        }
        System.out.println(count);
    }
}
