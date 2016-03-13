Dim msg, sapi
msg=InputBox("Enter your text for conversion–codenirvana.blogspot.com","Code Nirvana Text-To-Audio Converter")
Set sapi=CreateObject("sapi.spvoice")
sapi.Speak msg