//mail bcc: '', body: 'Prueba', cc: '', from: '', replyTo: '', subject: 'Prueba', to: 'angielizethmora@gmail.com'
int useSomeLib(Helper helper) {
    helper.prepare()
    return helper.count()
}

echo useSomeLib(new Helper('some text'))
