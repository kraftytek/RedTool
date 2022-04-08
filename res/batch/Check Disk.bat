@echo off

if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)

ECHO This will Run a check disc on your windows drive, this can take some time to run and the PC will not be usable while its running.

pause

chkdsk C: /f /r