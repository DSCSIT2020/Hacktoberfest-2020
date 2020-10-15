import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from getpass import getpass

# Emiail Yang dikonfigurasi
configured_email = "//Your Email"
# Server Email
server = smtplib.SMTP('smtp.gmail.com', 587)
# Password Email yang dikonfigurasi
configured_email_pass = "tokoonlinerpl2"
# array
msg = MIMEMultipart()


def smucc():
    try:
        print "Send Email With Configured Email in Code"
        # Email Pengirim
        msg['From'] = configured_email
        # Email Penerima
        msg['To'] = raw_input("Input Your Receiver Email address : ")
        # Email Subject
        msg['Subject'] = raw_input("Input Your Subject Email : ")
        # Isi Email
        body = raw_input("Your Email Content : ")
        msg.attach(MIMEText(body, 'plain'))
        # Mulai Proses
        server.starttls()
        # Login Email
        server.login(configured_email, configured_email_pass)
        # Convert to String
        txtcontent = msg.as_string()
        # Proses Pengiriman Email (Pengirim,Penerima,Isi)
        server.sendmail(configured_email, msg['To'], txtcontent)
        # Akhiri Proses
        server.quit()
        print "Success Send Email"
    except:
        print "Something Else In Your Code"


def smupc():
    try:
        print "Send Email With Program Configuration"
        # Email Pengirim
        msg['From'] = raw_input("Input Your Email address : ")
        # Password Pengirim
        password = getpass("Your Password : ")
        # Email Penerima
        msg['To'] = raw_input("Input Your Receiver Email address : ")
        # Email Subject
        msg['Subject'] = raw_input("Input Your Subject Email : ")
        # Isi Email
        body = raw_input("Your Email Content : ")
        msg.attach(MIMEText(body, 'plain'))
        # Mulai Proses
        server.starttls()
        # Login Email
        server.login(msg['From'], password)
        # Convert to String
        txtcontent = msg.as_string()
        # Proses Pengiriman Email (Pengirim,Penerima,Isi)
        server.sendmail(msg['From'], msg['To'], txtcontent)
        # Akhiri Proses
        server.quit()
        print "Success Send Email"
    except:
        print "Something Else In Your Code"


def anyelse():
    print "Menu Is not Defined"


print "======================================================================="
print "==       Simple Send Email Project With Based Python Language        =="
print "==   By : Hafiz Caniago || Github : https://github.com/hafizcode02   =="
print "======================================================================="
print "List Menu"
# menggunakan email berdasarkan data yang ditetapkan di dalam code program
print "1. Send Mail Using Code Configuration"
# menggunakan emaol berdasarkan apa yang kita inputkan di program
print "2. Send Mail Using Program Configuration"
# masukan pilihan kalian
choose = input("Please Choose : ")
if choose == 1:
    smucc()
elif choose == 2:
    smupc()
else:
    anyelse()
