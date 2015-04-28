$(document).ready(function () {

    $('#btn-add').click(function () {
        $('#select-from option:selected').each(function () {
            $('#select-to').append("<option value='" + $(this).val() + "'>" + $(this).text() + "</option>");
            //$('#select-to option').prop('selected', true);
            $(this).remove();
        });
    });
    $('#btn-remove').click(function () {
        $('#select-to option:selected').each(function () {
            $('#select-from').append("<option value='" + $(this).val() + "' >" + $(this).text() + "</option>");

            $(this).remove();
        });
    });

    $("#btnHorario").click(function () {
        $('#select-to option').prop('selected', true);        
    });
});