public class SortedArray { 
    int assignmentCount = 0;
    
    int warriorArray[] = new int[100];
    
    public int getAssignmentCount(){
        return assignmentCount;
    }
    
    public void insert(Warrior warrior) {    
        if (warriorArray[0] == 0){
            warriorArray[0] = warrior.getSpeed();
            assignmentCount += 1;
        } else {
            int i = warriorArray.length - 1;
            assignmentCount += 1;

            while (warrior.getSpeed() > warriorArray[i] && i >= 0){
                if(i == 0){
                    int bugFix = warriorArray[i];
                    assignmentCount += 1;
                    int j = 1;
                    assignmentCount += 1;

                    while(warriorArray[j]>bugFix){
                        warriorArray[j] = warriorArray[j-1];
                      assignmentCount += 1;
                        j++;
                    }

                    warriorArray[i] = warrior.getSpeed();
                    assignmentCount += 1;
                } else {
                    warriorArray[i] = warriorArray[i-1];
                    assignmentCount += 1;

                    if(i>1){
                        if (warrior.getSpeed() < warriorArray[i-1]){
                            warriorArray[i] = warrior.getSpeed();
                            assignmentCount += 1;
                        } 
                    } else {
                        warriorArray[i] = warrior.getSpeed();
                        assignmentCount += 1;
                    }

                    i--;
                }
            }
        
        }
    }

    
    public String toString(){
        String temp = "[ ";

        for (int i = 0; i < warriorArray.length; i ++){
            temp += "(" + warriorArray[i] + ")";
        }

        temp += ']';
        return temp;
    }
}
