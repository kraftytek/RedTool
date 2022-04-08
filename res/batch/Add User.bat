@echo off

if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)

ECHO This will add a new user as an administrator on your PC

pause

ECHO Enter a username: 

set /p username=""

ECHO Enter a password: 

set /p password=""

net user {%username%} {%password%} /add