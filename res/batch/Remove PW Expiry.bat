@echo off
if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)
wmic useraccount where Name='username' SET PasswordExpires=FALSE