public class SortedArray { 
    int assignmentCount = 0;
    
    int warriorSpeed[] = new int[100];
    
    public int getAssignmentCount(){
        return assignmentCount;
    }
    
    public void insert(Warrior warrior) {    
        if (warriorSpeed[0] == 0){
            warriorSpeed[0] = warrior.getSpeed();
            assignmentCount += 1;
        } else {
            int i = warriorSpeed.length - 1;
            assignmentCount += 1;

            while (warrior.getSpeed() > warriorSpeed[i] && i >= 0){
                if(i == 0){
                    int bugFix = warriorSpeed[i];
                    assignmentCount += 1;
                    int j = 1;
                    assignmentCount += 1;

                    while(warriorSpeed[j]>bugFix){
                        warriorSpeed[j] = warriorSpeed[j-1];
                      assignmentCount += 1;
                        j++;
                    }

                    warriorSpeed[i] = warrior.getSpeed();
                    assignmentCount += 1;
                } else {
                    warriorSpeed[i] = warriorSpeed[i-1];
                    assignmentCount += 1;

                    if(i>1){
                        if (warrior.getSpeed() < warriorSpeed[i-1]){
                            warriorSpeed[i] = warrior.getSpeed();
                            assignmentCount += 1;
                        } 
                    } else {
                        warriorSpeed[i] = warrior.getSpeed();
                        assignmentCount += 1;
                    }

                    i--;
                }
            }
        
        }
    }

    
    public String toString(){
        String temp = "[ ";
        
        for (int i = 0; i < warriorSpeed.length; i ++){
            temp += "(" + warriorSpeed[i] + ")";
        }

        temp += ']';
        return temp;
    }
}
