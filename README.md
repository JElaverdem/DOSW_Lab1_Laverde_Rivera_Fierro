<<<<<<< HEAD
Laboratory 1 — Git, GitHub, and Functional Programming

Team Members
|-----------------------------|-------------------------------------|-----------------|
| Name                        | Institutional Email                 | GitHub Username |
|-----------------------------|-------------------------------------|-----------------|
| Juan José Rivera López      |juan.rivera@escuelaing.edu.co        |Juanjorivlo      |
| Juan Esteban Laverde Mesa   |juan.lmesa@mail.escuelaing.edu.co    | JElaverdem      |
| Brian Steven Fierro Lechuga |brian.fierro-l@mail.escuelaing.edu.co| BrianFierro03   |
|-----------------------------|-------------------------------------|-----------------|

 Challenge Evidence & Technical Explanations

# Challenge 1 — Welcome Message
[Challenge 1 evidence](images/challenge1.png)
Description:
We use 3 different classes, the main class, the student class, and the message class, the student class has the student attributes, We divided between Juan Jose and Juan Esteban, Juan jose implements the welcome class and Juan Esteban the Student class. We use: push, pull, commit, add. We didn't have any conflict with the merge

# Challenge 2 — Parallel Commit Race
[Challenge 2 evidence](images/challenge2.png)
Description: It works with the simulation of the threats, implement the process paralelo and indepement from line 1 and line 2, Juan Jose work like A student, Brian Like student B, he develoment and implemnt the logic for line 2.  We use: push, pull, commit, add. We didn't have any conflict with the merge

# Challenge 3 — The Mysterious Echo
[Challenge 3 evidence](images/challenge3.png)
Description:
In Challenge 3, I implemented the Builder pattern while Brian and Juan Esteban reviewed and approved the code on GitHub. Issues with untracked files when switching branches were resolved by temporarily isolating the changes using git stash.

# Challenge 4 — The Treasure of Duplicate Keys
[Challenge 4 evidence](images/challenge4.png)
Description:
For Challenge 4, I implemented the reading of Map collections using Streams, and Brian validated the execution of the merge. We resolved compilation errors by removing the package declaration and avoided overwriting code when switching branches by temporarily renaming files using mv. 

# Challenge 5 — Battle of Sets
[Challenge 5 evidence](images/challenge5.png)
Description:
*   What was implemented: A HashSet and a TreeSet that use lambda functions to filter numbers that we do not want, to get them into order we use the TreeSet and use another lambda function to print the message with the numbers.
*   How the work was divided: Juan Laverde implemented the part of the HashSet, Brian Fierro implemented the TreeSet and the answer to the challenge, printing it.
*   Which Git operations were used: git push, git pull, git commit -m, git merge.
*   Which conflicts appeared: No conflict appeared.
*   How the conflicts were resolved: It was not necessary to resolve a conflict.

# Challenge 6 — The Decision Machine
[Challenge 6 evidence](images/challenge6.png)
Description:
* What was implemented:Lambda functions to print the messages, a map of the class 'Runnable' to better implement the texts of the print, a switch to know and be sure the command was something expected.
* How the work was divided: Juan Esteban created the structure of the challenge and implemented the part of Student A, Brian Steven implemented the part of Student B and the execution of those commands.
* Which Git operations were used: git checkout -b, git commit -m, git push, git merge.
* Which conflicts appeared: When trying to merge the changes to develop, the contents of the README about the challenge 6 dissapeared.
* How the conflicts were resolved: Using the last commit in the branch of the challenge copy what was in the README and talked with the team to know what happened so we can be more careful.

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

 Answers to the Conceptual Questionnaire

1. Team agreements:
-We are going to communicate through a group in WhatsApp and have a group in team wich we are going to use to make calls if needed.

2. What is the difference between git merge and git rebase?
* GIT MERGE: combines branches,created by a new merge commit. This preserves the exact historical timeline, show how we was working. But it can the graph looks cluttered.
* GIT REBASE: Moves or combine a sequence of commits to a new base commit. It can rewrite the project history by creating brand-new commits for each commit from the original branch.

3. What happens when two branches modify the same line of a file?
   -When two modify the exact branches exact line of life, and you tip the merge them, it automatically cant back which decides version to keep.
   Git pauses de merge process, arks the file as conflicted, and interests these markers   <<<<<<<, =======, >>>>>>> . 

5. How can you display the branch and merge history graphically in the terminal?
 -You must use this command for the representation branch :  git log --graph --oneline --all
6. What is the difference between a commit and a push?
-With a commit we change the 'staging' workplace, where we upload but it can not be seen by others or in GitHub, we use a push to upload the changes made with the commits to the remote workplace wich is GitHub, if we push, it can be seen by others.

7. What are git stash and git stash pop used for?
   both are used to temporarily save your unfinished work without making a commit.
* GIT STASH: use for saving a work. and have this flow: git stash -> git checkout main -> commit the bug.
* GIT STASH POP: use for restoring a work. and have this flow: git checkout feature-branch->git stash pop->commit the bug.
8. What is the difference between HashMap and Hashtable?
*  HASHMAP: is non-sychronized, not thread-safe, allows a null keys values, and offers fast performances.
* HASTABLE: is synchronized (thread-safe), forbids any null keys or values, and is a slower legacy class.
9. What advantages does Collectors.toMap() provide over a traditional loop?
  Collectors.toMap() has some advantages compared to using a normal for loop:
* Cleaner code: You can create a map in one line instead of writing several lines with a loop.
* Works well with streams: It is easy to use inside a stream and can help make the code simpler and safer.
* Handles duplicate keys: If two elements have the same key, you can add a merge function to decide what value to keep instead of writing extra if statements. 
10. When using stream().map() on a list of objects, what type of operation is being performed?
-This is an intermediate, stateless transformation operation because it changes each element, does not create the final result yet, and processes every element independently.
11. Wat does stream().filter() do, and what does it return?
-It transfoms the iterable collection into an stream with all the things inside it, with filter we can decide wich numbers that fulfill a condition we are going to continue to use. When we perform a stream().filter() it creates a new Stream that contains the numbers that satisfy that condition.

12. Describe the steps required to create a new feature branch from develop.
-To create a new branch from develop, follow these steps:
* Go to the develop branch: git checkout develop
* Update your local branch: git pull origin develop
* Create and switch to a new branch: git checkout -b feature/your-feature-name
* Push the branch to the remote repository: git push -u origin feature/your-feature-name

13. What is the difference between git branch and git checkout -b?
-git branch <branch-name> only creates a new branch and keeps you on the current branch.

git checkout -b <branch-name> creates a new branch and switches to it immediately.


14. Why should new functionality be developed in feature/* branches instead of directly in main?
-To have a better workflow and because we only merge into main when we are certain the software is fully working because it is what we are going to deliver to production and we do not want to keep changing a lot a working software located in main
=======
Team Members:

Juan Esteban Laverde Mesa

Juan José Rivera Lopez

Brian Steven Fierro Lechuga



Challenge1:
##Evidence:
![Challenge evidence](images/Challenge1.png)

##Description:
We use 3 different classes, the main class, the student class, and the message class, the student class has the student attributes, We divided between Juan Jose and Juan Esteban, Juan jose implements the welcome class and Juan Esteban the Student class. We use: push, pull, comit, add. We didn't have any conflict
Challenge2:


