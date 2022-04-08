@echo off

if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)

ECHO This will remove the periodic propmt to change the password for your Microsoft account

pause

wmic useraccount where Name='username' SET PasswordExpires=FALSE