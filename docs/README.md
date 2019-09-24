
# Duke User Guide

## 1. Introduction

Duke is a task manager that allows users to manage any tasks they have to do.

![](docs/UI.png)

## 2. Usage

### 2.1 List Command
### 2.1.1 `list` - Prints list of all the tasks in from the list

Lists everything in the list

*Example input:*

```
list
```
*Example output:*
```
1. [D][X][1] submission (by: 31-12-2019 23:59)
2. [E][/][3] raid (at: 20-09-2019 18:00)
3. [T][X][3] read book
```

### 2.2 Done Command
### 2.2.1 `done`- Sets a task as done
Marks a task as done

*Example input:*

```
done 3
```
*Example output:*
```
Noted, I've marked this task as done:
  [D][/][2] homework (/by 31-12-2019 23:59)
```


### 2.3 Delete Command
### 2.3.1 `delete` - Deletes a task from the list
Removes a task from the list

*Example input:*

```
delete 2
```
*Example output:*
```
Noted, I've removed this task:
  [T][/][2] sleep
```



### 2.4 Find Command
### 2.4.1 `find`- Searches the list for tasks with keyword
Prints a list of tasks with matching keyword

*Example input:*

```
find book
```
*Example output:*
```
1. [T][X][3] read book
2. [D][X][1] return book (by: 25-12-2019 23:00)
```

### 2.5 SortCommand 
### 2.5.1 `sort` - Prints the list of tasks with specified priority
Prints tasks with specified priority

*Example input:*
```
sort 2
```
*Example output:`
```
1. [T][X][2] read book
2. [D][X][2] return book (by: 25-12-2019 23:00)
3. [E][/][2] meeting with group (at: 12-20-2019 18:00)
```


### 2.6 Add Commands
Add different types of tasks to the list.  All newly added tasks will be marked as undone by default

### 2.6.1 `todo`- Add todo task to the list
Adds a todo task to the list.

*Example input:*
*format: *
```
todo sleep 2
```
*Example output:*
```
Got it I've added this task:
  [T][X][2] sleep
Now you have 3 tasks in the list
```



### 2.6.2 `event`- Add event task to the list
Adds an event task to the list

*Example input:*

```
event workshop 1 /at 12-06-2019 14:00
```
*Example output:*
```
Got it I've added this task:
  [E][X][1] workshop (at: 12-06-2019 14:00)
Now you have 4 tasks in the list
```





### 2.6.3 `deadline` - Add deadline task to the list
Adds a deadline task to the list
*Example input:*

```
deadline assignment 1 /by 31-12-2019 23:59
```
*Example output:*
```
Got it I've added this task:
  [D][X][1] assignment (by: 31-12-2019 23:59)
Now you have 5 tasks in the list
```




### 2.7 Bye Command
### 2.7.1 `bye` - terminates duke and saves the changes made
Exits duke and saves all changes made

*Example input:*
```
bye
```
*Example output:*
```

```


### 3. Command Summary

| Command  | Usage  |  Example |
|---|---|---|
| ListCommand  | list| list  |
| DoneCommand  | done <$index>  |  done 3 |
| DeleteCommand  | delete <$index>  |  delete 2 |
| FindCommand  | find <$word(s) to find>  |  find book |
| SortCommand | sort <$index> | sort 2 |
| AddCommand  |  todo <$description> <$priority> |  todo read book 3 |
| AddCommand  | event <$description> <$priority> /at <$date> <$time> | event raid Area 51 1 /at 20-09-2019 18:00  |
| AddCommand  |  deadline <$description> <$priority> /by <$date> <$time> | deadline final submission 1 /by 31-12-2019 23:59  |
| ByeCommand | bye  |   |
