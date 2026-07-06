class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = -1;
        
        int sec = 0;
        int skill = 0;
        int maxsec = bandage[0];
        int heal = bandage[1];
        int plustHeal = bandage[2];
        int maxhealth = health;
        
        for(int i = 1; i <= attacks[attacks.length-1][0]; i++) {
            
            if(attacks[sec][0] == i) {
                health -= attacks[sec][1]; 
                
                if(health <= 0) {
                    return answer; 
                }
                sec++;
                skill = 0;
            } else {
                skill++;
                health = Math.min(maxhealth, health + heal);
                
                
                if(skill == maxsec) {
                    health = Math.min(maxhealth, health + plustHeal);
                    skill = 0;
                }
            }
            
        }
        
        return health;
    }
}