﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private nf As String = "lesson17_data.txt"
	
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	Log(File.DirApp)
	Log(File.DirAssets)
	Log(File.DirTemp) 
	Log(File.DirData("Ejemplo1"))
	
	Private strCarpeta As String = File.DirTemp & "tema17\"
	Log(strCarpeta)
	File.MakeDir(File.DirTemp, "tema17")

	If File.Exists(strCarpeta, nf) Then
		Log("El fichero " & nf & " ya existe")
	Else
		Log("No existe el fichero " & nf)
	End If
	
	File.OpenOutput(strCarpeta, nf, True)
	
	Private msj As String = "Hola Mundo 2"
	File.WriteString(strCarpeta, nf, msj)
	
	Private msj As String = $"
	If you can keep your head when all about you   
    Are losing theirs and blaming it on you,   
	If you can trust yourself when all men doubt you,
    But make allowance for their doubting too;   
	If you can wait and not be tired by waiting,
    Or being lied about, don’t deal in lies,
	Or being hated, don’t give way to hating,
    And yet don’t look too good, nor talk too wise:

	If you can dream—and not make dreams your master;   
    If you can think—and not make thoughts your aim;   
	If you can meet with Triumph and Disaster
    And treat those two impostors just the same;   
	If you can bear to hear the truth you’ve spoken
    Twisted by knaves to make a trap for fools,
	Or watch the things you gave your life to, broken,
    And stoop and build ’em up with worn-out tools:

	If you can make one heap of all your winnings
    And risk it on one turn of pitch-and-toss,
	And lose, and start again at your beginnings
    And never breathe a word about your loss;
	If you can force your heart and nerve and sinew
    To serve your turn long after they are gone,   
	And so hold on when there is nothing in you
    Except the Will which says to them: ‘Hold on!’

	If you can talk with crowds and keep your virtue,   
    Or walk with Kings—nor lose the common touch,
	If neither foes nor loving friends can hurt you,
    If all men count with you, but none too much;
	If you can fill the unforgiving minute
    With sixty seconds’ worth of distance run,   
	Yours is the Earth and everything that’s in it,   
    And—which is more—you’ll be a Man, my son!
	
	"$
	File.WriteString(strCarpeta, nf, msj)
	
	
'	File.ReadString (Dir As String, FileName As String) As String
	Private strContenidoFichero As String
	strContenidoFichero = File.ReadString(strCarpeta, nf)
	Log("El fichero contiene") 
	Log(strContenidoFichero)


	


End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	xui.MsgboxAsync("¡Hola Mundo!", "B4X")
End Sub

