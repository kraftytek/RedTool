@echo off

if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)

ECHO This will run a disc image check

pause

dism /online /cleanup-image /restorehealth