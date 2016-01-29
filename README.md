If you run curl -v -X POST -d @file_which_does_not_freeze_connection.txt  http://127.0.0.1:9000/test
then it returns 500 error as expected and closes connection.

But if you run curl -v -X POST -d @file_which_freezes_connection.txt  http://127.0.0.1:9000/test
then it returns 100 and keeps connection. 

Both files differs only in one new line at the end of file and one extra character at the end. 