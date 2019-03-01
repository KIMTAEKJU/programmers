package programmers;

public class 스킬트리 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		스킬트리 a = new 스킬트리();
		String[] b = {"BACDE", "CBADF", "AECB", "BDA"};
		a.solution("CBD", b);
	}
	
	public int solution(String skill, String[] skill_trees) 
	{
		boolean[] checkFirstSkill = new boolean[skill.length()];
		char skillValue = skill.charAt(0);
		int skillIndex = 1;
		int checkIndex = 0;
		int countCorrectSkill = 0;
		
		first: for (int i = 0; i < skill_trees.length; i++) // 전체배열
		{
			checkIndex = 0;
			skillIndex = 1;
			skillValue = skill.charAt(0);
			
			twice: for (int j = 0; j < skill_trees[i].length(); j++) // 하나의 문자열
			{
				System.out.println("skill_trees[i] : " + skill_trees[i]);
				System.out.println("skill_trees[i].charAt(j) : " + skill_trees[i].charAt(j));
				
				if (skill_trees[i].charAt(j) == skillValue)
				{
					checkFirstSkill[checkIndex++] = true;
					if (skillIndex < skill.length())
						skillValue = skill.charAt(skillIndex);
					
					if (skillIndex == skill.length())
						break twice;
					
					skillIndex++;
					System.out.println("skillValue : " + skillValue);
					System.out.println("checkIndex : " + checkIndex);
					System.out.println("skillIndex : " + skillIndex);
					continue twice;
				}
				
				for (int k = 0; k < skill.length(); k++)
					if (checkIndex != k && skill_trees[i].charAt(j) == skill.charAt(k))
						continue first;
			}
			
			countCorrectSkill++;
			System.out.println("통과 : " + skill_trees[i]);
		}
		
		System.out.println(countCorrectSkill);
    
        return countCorrectSkill;
    }

}
