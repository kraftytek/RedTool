@echo off

if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)

ECHO This will copy the specified directory to another directory

pause

ECHO Enter the source directory

set /p source=""

ECHO Enter the destination directory

set /p destination=""

cmd /c \Xcopy {%source%} {%destination%} /s /i /y /e /h /c >Report.txt
2>ErrorReport.err