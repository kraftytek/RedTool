@echo off

if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)

ECHO This will remove the specified directory from your system

pause

ECHO Enter the directory to remove:

set /p directory=""

rmdir {%directory%} /s /q